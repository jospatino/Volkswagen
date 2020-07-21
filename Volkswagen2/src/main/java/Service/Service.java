package Service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import Repository.BalanceRepository;
import model.Account;
import model.Transfer;

@Path("/VolkswagenService")
public class Service {

	BalanceRepository br = new BalanceRepository();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getAccount/{account}")
	public Account getAccount(@PathParam("account") int account) {
		
		return br.getBalance(account);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/transactionsByAccount/{account}")
	public List<Transfer> gettransactionsByAccount(@PathParam("account") int account) {
		
		return br.getTransactionsByAcount(account);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/recievedTransactionsByAccount/{account}")
	public List<Transfer> getrecievedTransactionsByAccount(@PathParam("account") int account) {
		
		return br.getRecievedTransferByAcount(account);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/sentTransactionsByAccount/{account}")
	public List<Transfer> getsentTransactionsByAccount(@PathParam("account") int account) {
		
		return br.getTransferByAcount(account);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/sendMoney")
	public void sendMoney(Transfer t) {
		
		 br.transferMoney(t);
	}
	
}
