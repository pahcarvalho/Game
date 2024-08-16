//Abstração
abstract class Ferramenta {
    protected Material material;

    public Ferramenta(Material material) {
        this.material = material;
    }

    abstract void usar();
}