package com.galvanize.resources;

import com.galvanize.model.Review;
import com.galvanize.service.ReviewService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/reviews")
public class ReviewResource {
    ReviewService reviewService = new ReviewService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Review> getReviews() {
        return reviewService.getAllReviews();
    }

    @GET
    @Path("/{reviewId}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Review> getReviews(@PathParam("reviewId") long id) {
        return reviewService.getSnackReviews(id);

    }

}
