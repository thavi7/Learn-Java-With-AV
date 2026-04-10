public class Computer {
    private  String Brand;
    private String Model;
    private OperatingSystem OS;

    static class USB{
        private String type;

        public USB(String type) {
            this.type = type;
        }
       public void displayInfo(){
            System.out.println("USB Type: "+type);
        }
    }




    public Computer(String brand, String model,String osName) {
        this.Brand = brand;
        this.Model = model;
        this.OS=new OperatingSystem(osName);
    }

    public OperatingSystem getOS() {
        return OS;
    }

    class OperatingSystem{
        private String osName;

        public OperatingSystem(String osName) {
            this.osName = osName;
        }
        public void displayInfo(){
            System.out.println("computer Model: "+Model+" OS:"+osName);
        }
    }
}
