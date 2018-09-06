package com.galvanize.service;

import com.galvanize.database.DatabaseClass;
import com.galvanize.model.Review;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class ReviewService {
    private Map<Long, Review> reviews = DatabaseClass.getReviews();

    public ReviewService() {
        reviews.put(1L, new Review(1,"Incredible!", "If it were a person I'd say to it: Is your name Dan Druff? You get into people's hair. I mean like, I'd say that you're funny but looks aren't everything.",  1,  1 ));
        reviews.put(2L, new Review(2, "Tasty!", "If it were a person I'd say to this snack: I appreciate all of your opinions. I mean like, You have ten of the best fingers I have ever seen!", 3, 2));
        reviews.put(3L, new Review(3, "Tasty!", "If it were a person I'd say to it: Learn from your parents' mistakes - use birth control! I mean like, I thought of you all day today. I was at the zoo.", 2, 3));
        reviews.put(4L, new Review(4, "Refined!", "If it were a person I'd say to this snack: I would share my dessert with you. I mean like, You are a champ!", 5, 4 ));
        reviews.put(5L, new Review(5, "Ergonomic!", "If it were a person I'd say to it: It looks like your face caught on fire and someone tried to put it out with a hammer. I mean like, You're so fat your belly button has an echo echo echo...",  1, 5 ));
        reviews.put(6L, new Review(6, "Refined!", "If it were a person I'd say to this snack: We would enjoy a cookout with you! I mean like, You are the rare catalyst to my volatile compound.", 4, 6));
        reviews.put(7L, new Review(7, "Small!", "If it were a person I'd say to it: You're so fat your shadow casts a shadow. I mean like, You may not be the best looking girl here, but beauty is only a light switch away!", 2,7 ));
        reviews.put(8L, new Review(8, "Intelligent!", "If it were a person I'd say to this snack: There isn't a thing about you that I don't like. I mean like, You will still be beautiful when you get older.", 2, 8 ));
        reviews.put(9L, new Review(9, "Practical!", "If it were a person I'd say to it: You're so dumb, your dog teaches you tricks. I mean like, I don't exactly hate you, but if you were on fire and I had water, I'd drink it.", 2, 6 ));
        reviews.put(10L, new Review(10, "Ergonomic!", "If it were a person I'd say to this snack: You are the gravy to my mashed potatoes. I mean like, Will you sign my yearbook?", 5, 10));

    }

    public List<Review> getSnackReviews(long id) {

        ArrayList reviewArray = new ArrayList<Review>(reviews.values());
        ArrayList reviewResult = new ArrayList<Review>();

        ListIterator<Review> listIterator = reviewArray.listIterator();
        while( listIterator.hasNext()) {
            Review itrReview = listIterator.next();
            if (itrReview.getSnack_id() == id) {
                reviewResult.add(itrReview);
            }
        }

        return reviewResult;

    }

    public List<Review> getAllReviews() {
        return new ArrayList<Review>(reviews.values());
    }


    public Review postReview(Review review) {
        review.setId(reviews.size() + 1);
        reviews.put(review.getId(), review);

        return review;
    }




}
