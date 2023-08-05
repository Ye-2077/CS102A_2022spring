 public class Food {
        private int id, size;
        private double price;
        private String type, name;

        public Food(int id, String name, String type, int size, double price){
            this.id = id;
            this.size = size;
            this.price = price;
            this.type = type;
            this.name = name;
        }

        public void getMenu() {
            System.out.printf("[id]%2d\t[type] %-7s\t  [name] %-10s\t[size]%3d [Inches] %.2f $\n", id, type, name, size, price);
        }

        public void setId(int id) { this.id = id; }
        public void setSize(int size) { this.size = size; }
        public void setPrice(double price) {
            this.price = price;
        }
        public void setType(String type) {
            this.type = type;
        }
        public void setId(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }
        public int getSize() {
            return size;
        }
        public double getPrice() {
            return price;
        }
        public String getType() {
            return type;
        }
        public String getName() {
            return name;
        }
        }
