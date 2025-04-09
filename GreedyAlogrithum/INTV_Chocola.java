package GreedyAlogrithum;
import java.util.*;

public class INTV_Chocola {
    public static void main(String[] args) {
        // int n = 4, m = 6; // Chocolate dimensions (rows and columns)
        Integer costVer[] = {2, 1, 3, 1, 4}; // Cost of vertical cuts
        Integer costHor[] = {4, 1, 2}; // Cost of horizontal cuts
        
        // Sort costs in descending order for greedy selection
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int horizontalCuts = 0, verticalCuts = 0; // Tracks the number of cuts
        int horizontalPieces = 1, verticalPieces = 1; // Tracks resulting pieces
        int totalCost = 0;

        // Greedy selection of cuts
        while (horizontalCuts < costHor.length && verticalCuts < costVer.length) {
            if (costVer[verticalCuts] > costHor[horizontalCuts]) {
                totalCost += costVer[verticalCuts] * horizontalPieces;
                verticalPieces++;
                verticalCuts++;
            } else {
                totalCost += costHor[horizontalCuts] * verticalPieces;
                horizontalPieces++;
                horizontalCuts++;
            }
        }

        // Process remaining horizontal cuts
        while (horizontalCuts < costHor.length) {
            totalCost += costHor[horizontalCuts] * verticalPieces;
            horizontalPieces++;
            horizontalCuts++;
        }

        // Process remaining vertical cuts
        while (verticalCuts < costVer.length) {
            totalCost += costVer[verticalCuts] * horizontalPieces;
            verticalPieces++;
            verticalCuts++;
        }

        System.out.println("Minimum cost to cut chocolate: " + totalCost);
    }
}
