public class Main {

    // Abstração (Ferramenta)
abstract class Ferramenta {
    protected Material material;

    public Ferramenta(Material material) {
        this.material = material;
    }

    abstract void usar();
}

// Implementação concreta da Ferramenta
class Enxada extends Ferramenta {
    public Enxada(Material material) {
        super(material);
    }

    @Override
    void usar() {
        System.out.println("Usando a enxada " + material.aplicarMaterial());
    }
}

class Regador extends Ferramenta {
    public Regador(Material material) {
        super(material);
    }

    @Override
    void usar() {
        System.out.println("Usando o regador " + material.aplicarMaterial());
    }
}

// Interface para Implementação (Material)
interface Material {
    String aplicarMaterial();
}

// Implementações concretas dos Materiais
class MaterialCobre implements Material {
    @Override
    public String aplicarMaterial() {
        return "de Cobre";
    }
}

class MaterialAco implements Material {
    @Override
    public String aplicarMaterial() {
        return "de Aço";
    }
}

// Classe principal para testar o padrão Bridge
public class Principal {
    public static void main(String[] args) {
        Material cobre = new MaterialCobre();
        Ferramenta enxada = new Enxada(cobre);
        enxada.usar();  // Output: Usando a enxada de Cobre

        Material aco = new MaterialAco();
        Ferramenta regador = new Regador(aco);
        regador.usar();  // Output: Usando o regador de Aço
    }
}
    
}
