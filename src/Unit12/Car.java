package Unit12;

public class Car {
    Engine engine = new Engine();
    public class Engine {
        private boolean isRunning = false;

        public void start() {
            isRunning = true;
        }

        public void stop() {
            isRunning = false;
        }
    }
}
