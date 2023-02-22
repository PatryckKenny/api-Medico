package med.voll.api.medico;

public record ListagemDeMedico(String nome, String email, String crm, Especialidade especialidade) {

    public ListagemDeMedico(Medico medico){
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
