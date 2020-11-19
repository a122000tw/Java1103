package com.ocp6;

public class ForLoop2 {

    public static void main(String[] args) {
        double[][] rows = {
            {170.0, 180.5, 165.3},
            {60.4, 89.5, 41.2}
        };
        // enhanced for-loop
        for (double[] row : rows) {
            for (double d : row) {
                System.out.println(d);
            }
        }
        // standard for loop
        for (int i = 0; i < rows.length; i++) {
            double[] row = rows[i];
            for (int j = 0; j < row.length; j++) {
                double d = row[j];
                System.out.println(d);
            }
        }
                
            }
        }
        
    }
}

