
public class Computador {
    public String marca;
    public float preco;
    

    public MemoriaUSB memoriaUSB; //agregação

    //composição
    public HardwareBasico hardware[];
    public SistemaOperacional sistema;

    public Computador() {
        sistema = new SistemaOperacional();
        hardware = new HardwareBasico[3];
        for (int i = 0; i < hardware.length; i++) {
            hardware[i] = new HardwareBasico();
        }
    }

    public void mostraPCConfigs() {
        System.out.println("\nMarca do PC: " + marca);
        System.out.println("Preço: " + preco);
        System.out.println("Sistema Operacional: " + sistema.nome);
        System.out.println("Tipo (Bits): " + sistema.tipo);
        for(int i = 0; i < hardware.length; i++) {
            System.out.println("O hardware é composto por (Processadores em Mhz, memória e HD em Gb): " + hardware[i].nome + " e com capacidade de: " + hardware[i].capacidade);
        }
        if (this.memoriaUSB != null) {
            System.out.println("Memória USB (Gb): " + memoriaUSB.nome + " e com capacidade de: " + memoriaUSB.capacidade);
        }

    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;

    }
}
