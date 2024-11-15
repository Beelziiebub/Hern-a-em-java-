package herancanoite2;

public class Alunos {
	
	public class Alunos extends DadosPessoais {
	public int ra;
	public String curso;
	
	//get e set
	
	public void setIdPessoa(int _id) {   this.ra = _id;   }
	public void setCurso(String _nome) {  this.curso = _nome;     }
	
	
	public int  getIdPessoa()    {        return this.ra;            }
	public String  getNome()     {        return this.curso;      }

	
    //Construtores 
	
	public Aluno(int _id, String _nome, String _cpf, int _ra, String _curso) {
		
		super( _i, nome, _cpf);
	
		this.setRa( _ra);
		this.setCurso( _curso);
	}
	
	}
}



package herancanoite2;

public class DadosPessoais {
	
	public int idPessoa;
	public String nome, cpf;
	
	//GET E SETS 
	
	public void setIdPessoa(int _id) {   this.idPessoa = _id;   }
	public void setNome(String _nome) {  this.nome = _nome;     }
	public void setCpf(String _Cpf)  {   this.cpf = _Cpf;       }
	
	public int  getIdPessoa()        {   return this.idPessoa;  }
	public String  getNome()            {   return this.nome;      }
	public String  getCpf()          {      return this.cpf;       }
	
	
	//Construtores 
	
	public DadosPessoais(int _id, String _nome, String _cpf) {
		this.setIdPessoa( _id);
		this.setNome( _nome);
		this.setCpf( _cpf);
	}


package herancanoite2;

public class Principal {
    
    public static void main(String[] args) {
        
        // Criação do primeiro aluno
        Aluno aluno1 = new Aluno();
        System.out.println("Id. Pessoa: " + aluno1.getIdPessoa());
        System.out.println("Nome      : " + aluno1.getNome());
        System.out.println("CPF       : " + aluno1.getCpf());
        System.out.println("RA        : " + aluno1.getRA());
        System.out.println("Curso     : " + aluno1.getCurso());
        
        // Criação do segundo aluno
        Aluno aluno2 = new Aluno();
        System.out.println("Id. Pessoa: " + aluno2.getIdPessoa());
        System.out.println("Nome      : " + aluno2.getNome());
        System.out.println("CPF       : " + aluno2.getCpf());
        System.out.println("RA        : " + aluno2.getRA());
        System.out.println("Curso     : " + aluno2.getCurso());
    }
}
