package Unit14.NextMonth;

public class NextMonth {
    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.DECEMBER));
        System.out.println(Month.getWinterMonths());
        System.out.println(Month.getSpringMonths());
        System.out.println(Month.getSummerMonths());
        System.out.println(Month.getAutumnMonths());
    }

    public static Month getNextMonth(Month month) {

        int index = month.ordinal();
        if(index == Month.DECEMBER.ordinal()){
            return Month.JANUARY;
        }
        Month newDay = Month.values()[index+1];
        return newDay;
    }
}


