package fhbrs.soa.teamwork.fhbuchen;

import java.util.Date;
import java.util.Set;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class InvoiceSystem {
	@WebMethod
	Invoice searchInvoice(int invoiceNr){
		return null;
	}
	
	@WebMethod
	Set<Invoice> listInvoices(){
		return null;
	}
	
	@WebMethod
	void updateInvoice(Invoice i){
		
	}
	
	@WebMethod
	Invoice createInvoice(int billNr, Date date, String author, String reciever,
			Set<InvoicePosition> positions){
		Invoice i = new Invoice(billNr, date,author,reciever,positions);
		return i;
	}
}
