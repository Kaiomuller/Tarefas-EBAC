public class NotaAluno {

    private double nota1 = 9.4;
    private double nota2 = 9;
    private double nota3 = 6.7;
    private double nota4 = 6.8;

    public double mediaNotas(){
        double somaNotas = (nota1 + nota2 + nota3 + nota4) / 4;
        double media = somaNotas;
        return media;
    }

    public void resultadoMedia(){
        System.out.println();
        System.out.printf("  A média do aluno é %.2f %n", + mediaNotas());
    }

}

