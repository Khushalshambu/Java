package com.example.testrun;



public class cigars {
    static int cigars;
    static int isWeekend;

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend == false) {
            if (cigars >= 40 && cigars <= 60) {
                System.out.println(isWeekend = true);
            }
        }else if(isWeekend == true)
        { if(cigars>=40)
        {return isWeekend = true;}
        }

        return isWeekend = false;
    }
}
