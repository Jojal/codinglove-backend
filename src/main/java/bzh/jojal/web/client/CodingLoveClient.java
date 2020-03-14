package bzh.jojal.web.client;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RegisterRestClient()
public interface CodingLoveClient {

  @GET
  @Produces(MediaType.TEXT_HTML)
  String getWebpage();

}
