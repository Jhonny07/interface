public class Carro implements Motor, Veiculo{

    @Override
    public String getFabricante() {
        return "Fiat";
    }

    @Override
    public String getModelo() {
        return "Unozeras";
    }

    @Override
    public int getId() {
        return 1;
    }

    @Override
    public String getNome() {
        return "Peskcar";
    }

       
}
