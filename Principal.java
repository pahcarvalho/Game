// Bridge: demonstra como utilizar o padrão Bridge, instanciando ferramentas com diferentes materiais e realizando suas ações.
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