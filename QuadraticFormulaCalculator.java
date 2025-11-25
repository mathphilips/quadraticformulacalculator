package QuadraticFormulaCalculator;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class QuadraticFormulaCalculator {
    static void main() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> variables = new ArrayList<>(2);
        DecimalFormat d1 = new DecimalFormat("#.##");
        for (int i = 0; i < 3; i++){
            variables.add(sc.nextInt());
        }
        System.out.println("a: " + variables.get(0) + ", b: " + variables.get(1) + ", c: " + variables.get(2));

        short square = (short) Math.pow(variables.get(1), 2);
        short four = (short) (4 * variables.get(0) * variables.get(2));
        short squareRootNum = (short) (square - four);
        float squareRoot = (float) Math.pow(squareRootNum, 0.5);
        int b = -variables.get(1);
        float positiveAbove = b + squareRoot;
        float negativeAbove = b - squareRoot;
        float firstSolution = positiveAbove / (2 * variables.get(0));
        float secondSolution = negativeAbove / (2 * variables.get(0));
        System.out.println("There's your results: the first solution is: " + d1.format(firstSolution) + " and the second solution is: " + d1.format(secondSolution));
        sc.close();
        System.exit(0);
    }
}