package com.zoho;

public class chilFatherArray {
    public static void main(String[] args) {
        String [][] family = {
                {"luke","shaw"},
                {"wayne","rooney"},
                {"rooney","ronaldo"},
                {"shaw","rooney"}
        };
       String grandfather ="ronaldo";
       String father ="";
       int count =0;
        //int rows =4,columns =2;
        for(int i =0;i< family.length;i++){
            if(grandfather.equals(family[i][1])) {
                father = family[i][0];
                for (int j = 0; j < family.length; j++) {
                    if (father.equals(family[j][1])){ count++;}
                }
            }
        }
        System.out.println(""+count);
    }
}
