package com.roxoft.trainingteamone.logic;

import com.roxoft.trainingteamone.models.Crossroad;
import com.roxoft.trainingteamone.models.Road;
import org.apache.log4j.Logger;

import java.util.*;

/**
 * Created by Esenin on 17.10.2017.
 */
public class Algorithm {

    private static final Logger LOGGER = Logger.getLogger(Algorithm.class);

    private Map<Long, List<Road>> visitedCrossroads;


    private List<Road> roads;

    public Algorithm(List<Road> roads) {
        this.roads = roads;
    }

    private boolean getExistingPath(List<Road> roads, Crossroad fromCrossroad, Crossroad toCrossroad) {

        Queue<Crossroad> crossroadQueue = new LinkedList<>();
        visitedCrossroads = new HashMap<>();
        visitedCrossroads.put(fromCrossroad.getId(), new ArrayList<>());
        crossroadQueue.add(fromCrossroad);
        while (crossroadQueue.size() > 0) {
            Crossroad currentCrossroad = crossroadQueue.poll();
            List<Road> neighboardRoads = getRoadsByCrossroadId(roads, currentCrossroad.getId());
            for (Road currentRoad : neighboardRoads) {
                Crossroad walkToCrossroad = walkTo(currentCrossroad, currentRoad);
                boolean isReverseWay = currentCrossroad.getId() != currentRoad.getFromCrossroad().getId();
                if ((visitedCrossroads.get(walkToCrossroad.getId()) == null && currentRoad.getDailyCarryingCapacity() > 0 && !isReverseWay)
                        || (visitedCrossroads.get(walkToCrossroad.getId()) == null && currentRoad.getDailyCarryingCapacity() > getRoadById(currentRoad.getId()).getDailyCarryingCapacity()) && isReverseWay) {
                    crossroadQueue.add(walkToCrossroad);
                    List<Road> targetRoad = new ArrayList<>();
                    targetRoad.addAll(visitedCrossroads.get(currentCrossroad.getId()));
                    targetRoad.add(currentRoad);
                    visitedCrossroads.put(walkToCrossroad.getId(), targetRoad);
                }
            }
        }
        return visitedCrossroads.get(toCrossroad.getId()) != null;
    }

    public double getMaxFlow(Crossroad fromCrossroad, Crossroad toCrossroad) {

        double maxFlow = 0;
        List<Road> roads = new ArrayList<>(this.roads);
        while (getExistingPath(roads, fromCrossroad, toCrossroad)) {
            double min = Integer.MAX_VALUE;

            List<Road> foundFlow = getFoundFlow(toCrossroad);
            LOGGER.info("Found flow");
            printNameAndWeight(foundFlow);

            Crossroad previousCrossroad = fromCrossroad;
            for (Road road : foundFlow) {
                boolean isReverse = previousCrossroad.getId() != road.getFromCrossroad().getId();
                min = isReverse ? Math.min(min, road.getDailyCarryingCapacity() - getRoadById(road.getId()).getDailyCarryingCapacity()) : Math.min(min, road.getDailyCarryingCapacity());
                previousCrossroad = road.getToCrossroad();
            }

            LOGGER.info("Min of current flow: " + min);

            previousCrossroad = fromCrossroad;
            for (Road road : foundFlow) {
                if (previousCrossroad.getId() == road.getFromCrossroad().getId()) {
                    road.setDailyCarryingCapacity(road.getDailyCarryingCapacity() - min);
                    previousCrossroad = road.getToCrossroad();
                } else {
                    road.setDailyCarryingCapacity(road.getDailyCarryingCapacity() + min);
                    previousCrossroad = road.getFromCrossroad();
                }
            }

            LOGGER.info("After min");
            printNameAndWeight(foundFlow);
            maxFlow = maxFlow + min;
        }
        return maxFlow;
    }

    private List<Road> getRoadsByCrossroadId(List<Road> roads, long id) {

        List<Road> result = new ArrayList<>();
        roads.stream().filter(road -> road.getToCrossroad().getId() == id || road.getFromCrossroad().getId() == id)
                .forEach(residualRoad -> result.add(residualRoad));
        return result;
    }

    private Road getRoadById(long id) {

        for (Road road : roads) {
            if (road.getId() == id) {
                return road;
            }
        }
        return null;
    }

    private Crossroad walkTo(Crossroad currentCrossroad, Road road) {

        return currentCrossroad.getId() == road.getFromCrossroad().getId() ? road.getToCrossroad() : road.getFromCrossroad();
    }

    private List<Road> getFoundFlow(Crossroad toCrossroad) {

        return visitedCrossroads.get(toCrossroad.getId());
    }

    private void printNameAndWeight(List<Road> roads) {

        roads.stream().forEach(road -> LOGGER.info("        Current path: " + road.getFromCrossroad().getName()
                + " -> " + road.getToCrossroad().getName() + "(" + road.getDailyCarryingCapacity() + ")"));
    }

}
