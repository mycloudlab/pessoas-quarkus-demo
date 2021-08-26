package br.com.bb.conta;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/pessoas")
public class PessoaResource {

  Set<Pessoa> pessoas = new HashSet<>();
  private long delay;

  public PessoaResource(){
    pessoas.add(new Pessoa("00045789100", "CARLOS ALBERTO RODRIGUES DE OLIVEIRA SANTANA", "QUADRA 3 CASA 27", "SAO JOSE", "SAO SEBASTIAO", "DF", "71693004", "", "", ""));
  }
  
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Set<Pessoa> list() {
    System.out.println("Recebendo request");
    return pessoas;
  }
  
  @GET
  @Path("/delay")
  @Produces(MediaType.APPLICATION_JSON)
  public void delay(@QueryParam("delay") long delay) {
    System.out.println("delay configurado:" + delay);
    this.delay = delay;
  }


  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @Path("/{cpf}")
  public Response retrive(@PathParam("cpf") String cpf) {
    System.out.println("Recebendo request");
    try {
      System.out.println("aguardando..." + delay);
      Thread.currentThread().sleep(delay);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    List<Pessoa> pessoas = this.pessoas.stream().filter((p)->cpf.equals(p.getCpf()))  .collect(Collectors
        .toCollection(ArrayList::new));
    
    if (pessoas.isEmpty())
      return Response.status(404).build();
    
    return Response.ok(pessoas.get(0)).build();
    
  }


}
