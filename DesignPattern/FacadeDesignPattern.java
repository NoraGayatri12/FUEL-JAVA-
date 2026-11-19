// class CPU{
//     void start(){
//         System.out.println("CPU Started");
//     }
// }
//     class Memory{
//     void load(){
//         System.out.println("Memory Loaded");
//     }
// }
//     class HardDisk{
//     void read(){
//         System.out.println("Hard Disk Read");
//     }
// }
// public class Simple{
//     public static void main(String[] args) {
//         CPU cpu=new CPU();
//         Memory memory=new Memory();
//         HardDisk hd=new HardDisk();
//         cpu.start();
//         memory.load();
//         hd.read();
//     }
// }

// Using  Facade Design Pattern

class CPU {
    void start() {
        System.out.println("CPU Started");
    }
}

class Memory {
    void load() {
        System.out.println("Memory Loaded");
    }
}

class HardDisk {
    void read() {
        System.out.println("Hard Disk Read");
    }
}

// Facade Class
class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDisk hardDisk;

    public ComputerFacade() {
        cpu = new CPU();
        memory = new Memory();
        hardDisk = new HardDisk();
    }

    public void startComputer() {
        cpu.start();
        memory.load();
        hardDisk.read();
    }
}

// Main Class
public class FacadeDesignPattern {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.startComputer();
    }
}
