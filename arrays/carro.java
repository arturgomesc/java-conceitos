public class carro {
    private String nome;
    private Boolean ligado;
    private Boolean destruído;
    private int blindagem;
    private Boolean armamento;

    public carro(String nome) {
        this.nome = nome;
        this.ligado = false;
        this.destruído = false;
        this.blindagem = 0;
        this.armamento = false;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getLigado() {
        return this.ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    public Boolean getDestruido() {
        return this.destruído;
    }

    /*public void setDestruido(Boolean destruido) {
        this.destruido = destruido;
    }
     */
    public int getBlindagem() {
        return this.blindagem;
    }

    public void setBlindagem(int blindagem) {
        this.blindagem = blindagem;
    }

    public Boolean getArmamento() {
        return this.armamento;
    }

    public void setArmamento(Boolean armamento) {
        this.armamento = armamento;
    }

    public void sofrerDano(int dano) {
        this.blindagem -= dano;
        if (this.blindagem <= 0) {
            this.blindagem = 0;
            this.ligado = false;
            this.destruído = true;
        }
    }

        public void info() {
            System.out.println("------------------------------------ ");
            System.out.printf("Nome..........%s%n",this.nome);
            System.out.printf("Ligado........%s%n",this.ligado ? "Sim" : "Não");
            System.out.printf("Destruído.....%s%n",this.destruído ? "Sim" : "Não");
            System.out.printf("Blindagem.....%d%n",this.blindagem);
            System.out.println("Armamento...." + this.armamento);
        }
}
