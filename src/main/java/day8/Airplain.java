package day8;

class Airplane {
        private String producer;
        private int year;
        private int lenght;
        private int weight;
        private int fuel = 0;

        public Airplane(String producer, int year, int lenght, int weight){
            this.producer = producer;
            this.year = year;
            this.lenght = lenght;
            this.weight = weight;
        }
        public String toString(){
            return "Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + lenght + ", вес: " + weight + ", количество топлива в баке: " + fuel;
        }

        public void info(){
            System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + lenght + ", вес: " + weight + ", количество топлива в баке: " + fuel);
        }
        public void fillUp(int n){
            fuel = fuel + n;
            System.out.println("Запас топлива в баках самолета равен " + fuel + " литров");
        }

        public void setProducer(String producer){
            this.producer = producer;
        }
        public void setYear(int year){
            this.year = year;
        }
        public void setLenght(int lenght){
            this.lenght = lenght;
        }
        public void setWeight(int weight){
            this.weight = weight;
        }
        public void setFuel(int fuel){
            this.fuel = fuel;
        }
        public int getFuel(){
            return fuel;
        }
}
