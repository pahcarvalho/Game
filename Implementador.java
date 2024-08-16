//Implementação
class Enxada extends Ferramenta {
    public Enxada(Material material) {
        super(material);
    }

    @Override
    void usar() {
        System.out.println("Usando a enxada " + material.aplicarMaterial());
    }
}

// Arquivo: Regador.java
class Regador extends Ferramenta {
    public Regador(Material material) {
        super(material);
    }

    @Override
    void usar() {
        System.out.println("Usando o regador " + material.aplicarMaterial());
    }
}