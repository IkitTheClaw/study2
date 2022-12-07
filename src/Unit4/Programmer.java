package Unit4;

    public class Programmer {
        private int salary = 1000;

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = Math.max(salary, this.salary);
        }

        //напишите тут ваш код

    }


