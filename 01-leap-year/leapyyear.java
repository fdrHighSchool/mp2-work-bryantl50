class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2022));
        System.out.println(isLeapYear(2020));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1980));
    }
    //end main
    public static boolean isLeapYear(int x) {
        if ((x%4) == 0) {
            if ((x%100) == 0) {
                if ((x%400)==0) {
                    return true;
                }
                else {
                    return false;
                }
                //t or f if 400
            }
            else {
                return true;
            }
            //t or f if 100
        }
        else {
            return false;
        }
        //t or f if 4
    }
    //end isLeapYear
}
//end class
