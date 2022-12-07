package Unit5.Additionfl1;
import java.util.Calendar;
    public class Solution {

        private int currentYear;

        public void Solution() {
            this.currentYear = Calendar.getInstance().get(Calendar.YEAR);
        }

        public int getCurrentYear() {
            return currentYear;
        }

        public void setCurrentYear(int currentYear) {
            this.currentYear = currentYear;
        }

        public static void main(String[] args) {
            Solution solution = new Solution();
            System.out.println(solution.getCurrentYear());
        }
    }

