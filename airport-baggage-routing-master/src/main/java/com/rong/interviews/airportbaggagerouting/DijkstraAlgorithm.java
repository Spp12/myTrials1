package com.rong.interviews.airportbaggagerouting;

import com.rong.interviews.airportbaggagerouting.model.DirectedEdge;

import java.util.List;


public interface DijkstraAlgorithm {
    public String findShortestPath(String entry,String dest, List<DirectedEdge> graphEdges);
}
