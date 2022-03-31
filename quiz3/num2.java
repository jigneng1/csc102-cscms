class TestDriver {

    public static void main(String[] args) {
        // DO NOT MODIFY Main class and main function
        M1Pro m1Pro = new M1Pro(8, 14, 16);
        M1Max m1Max = new M1Max(10, 24, 16);

        MacBookPro mbp1 = new MacBookPro(m1Pro);
        MacBookPro mbp2 = new MacBookPro(m1Max);
        System.out.println("-----------MacBook Pro 1-----------");
        System.out.println("MBP1, Memory: " + mbp1.getMemory().getMemoryInGB() + " GB");
        System.out.println("MBP1, CPU: " + mbp1.getSilicon().getCPUCore() + " Cores");
        System.out.println("MBP1, GPU: " + mbp1.getSilicon().getGPUCore() + " Cores");
        System.out.println("MBP1, NeuralEngine: " + mbp1.getSilicon().getNeuralEngineCore() + " Cores");
        System.out.println("MBP1, MaxMemory: " + mbp1.getSilicon().getMaximumMemorySupportedInGB() + " GB");
        mbp1.modifyMemory(32);
        System.out.println("MBP1, Memory: " + mbp1.getMemory().getMemoryInGB() + " GB");
        mbp1.modifyMemory(64);
        System.out.println("MBP1, Memory: " + mbp1.getMemory().getMemoryInGB() + " GB");

        System.out.println("-----------MacBook Pro 2-----------");
        System.out.println("MBP2, Memory: " + mbp2.getMemory().getMemoryInGB() + " GB");
        System.out.println("MBP2, CPU: " + mbp2.getSilicon().getCPUCore() + " Cores");
        System.out.println("MBP2, GPU: " + mbp2.getSilicon().getGPUCore() + " Cores");
        System.out.println("MBP2, NeuralEngine: " + mbp2.getSilicon().getNeuralEngineCore() + " Cores");
        System.out.println("MBP2, MaxMemory: " + mbp2.getSilicon().getMaximumMemorySupportedInGB() + " GB");
        mbp2.modifyMemory(64);
        System.out.println("MBP2, Memory: " + mbp2.getMemory().getMemoryInGB() + " GB");
    }
}

abstract class AppleSilicon {
   private int maximumMemorySupportedInGB;
    private int neuralEngineCore;
    private int GPUCore;
    private int CPUCore;
    
    public AppleSilicon(int cpu, int gpu,int Engine,int memory){
        this.CPUCore = cpu;
        this.GPUCore = gpu;
        this.neuralEngineCore = Engine;
        this.maximumMemorySupportedInGB = memory;
    }

    public int getCPUCore(){
        return this.CPUCore;
    }
    public int getGPUCore(){
        return this.GPUCore;
    }
    public int getNeuralEngineCore(){
        return this.neuralEngineCore;
    }
    public int getMaximumMemorySupportedInGB(){
        return maximumMemorySupportedInGB;
    }
}

class M1Pro extends AppleSilicon {
    public M1Pro(int cpu,int gpu,int engine){
        super(cpu, gpu, engine ,32);
    }
}

class M1Max extends AppleSilicon {
   public M1Max(int cpu,int gpu,int engine){
        super(cpu, gpu, engine,64);
   }  
}

class Memory {
    private int memoryInGB ;

    public Memory(int mem){
        this.memoryInGB = mem;
    }
    public int getMemoryInGB(){
        return this.memoryInGB;
    }
}

class MacBookPro{
    private Memory memory;
    private AppleSilicon silicon;

    public MacBookPro(AppleSilicon silicon){
        this.silicon = silicon;
        memory = new Memory(16);
    }
    public void modifyMemory(int mem){
        if(mem<=silicon.getMaximumMemorySupportedInGB()){
            memory = new Memory(mem);
        }
        else{
            System.out.print("ERROR");
        }
    }
    public Memory getMemory(){
        return memory;
    }
    public AppleSilicon getSilicon(){
        return silicon;
    }
}



