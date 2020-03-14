package bzh.jojal.web;

import bzh.jojal.web.client.CodingLoveClient;
import bzh.jojal.web.model.Gif;
import bzh.jojal.web.service.CodingLoveService;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/codinglove/api/v1/")
public class CodingLoveResource {

  @Inject
  @RestClient
  CodingLoveClient client;

  @Inject
  CodingLoveService service;

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public Gif getGif() {
    return service.getLastGif(client.getWebpage());
  }
}
