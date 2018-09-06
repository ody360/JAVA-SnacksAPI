package com.galvanize.service;

import com.galvanize.database.DatabaseClass;
import com.galvanize.model.Snack;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class SnackService {
    private Map<Long, Snack> snacks = DatabaseClass.getSnacks();

    public SnackService() {
        snacks.put(1L, new Snack(1, "Pork Rinds", "Mauris lacinia sapien quis libero. Nam dui. Proin leo odio, porttitor id, consequat in, consequat ut, nulla. Sed accumsan felis.", 8, "https://az808821.vo.msecnd.net/content/images/thumbs/0000398_salt-pepper-pork-rinds-2-oz_560.jpeg", true));
        snacks.put(2L, new Snack( 2, "Soup - Campbells Beef Noodle",  "Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Etiam vel augue. Vestibulum rutrum rutrum neque.",  26,  "https://images-na.ssl-images-amazon.com/images/I/71MavWF1P9L._SY550_.jpg", false));
        snacks.put(3L, new Snack(3, "Pie Filling - Cherry",  "Nam dui. Proin leo odio, porttitor id, consequat in, consequat ut, nulla. Sed accumsan felis. Fusce posuere felis sed lacus.",  3,  "http://wickedgoodkitchen.com/wp-content/uploads/2018/06/Mom%E2%80%99s-Homemade-Tart-Cherry-Pie-Filling.png",  false));
        snacks.put(4L, new Snack(4, "Chicken - Chicken Phyllo", "Donec vitae nisi. Nam ultrices, libero non mattis pulvinar, nulla pede ullamcorper augue, a suscipit nulla elit ac nulla.",  5,  "https://tmbidigitalassetsazure.blob.core.windows.net/secure/RMS/attachments/37/1200x1200/exps191978_SD163575C10_07_6b.jpg",  true));
        snacks.put(5L, new Snack(5, "Foam Dinner Plate",  "In quis justo. Maecenas rhoncus aliquam lacus. Nam dui. Proin leo odio, porttitor id, consequat in, consequat ut, nulla. Sed accumsan felis.",  5,  "http://www.uscasehouse.com/media/catalog/product/cache/1/image/736x460/9df78eab33525d08d6e5fb8d27136e95/p/a/pactiv-0th1001000y-satinware-white-foam-dinner-plate-540-case-bulk-us-casehouse.jpg",  false));
        snacks.put(6L, new Snack(6, "Wine - White, Riesling, Semi - Dry", "Nam dui. Proin leo odio, porttitor id, consequat in, consequat ut, nulla. Sed accumsan felis. Suspendisse potenti. Nullam porttitor lacus at turpis. Donec posuere metus vitae ipsum.",  13,  "https://www.bothamvineyards.com/wp-content/uploads/2013/03/riesling-cropped-lo-res.jpg",  false));
        snacks.put(7L, new Snack(7, "Cheese - Taleggio D.o.p.",  "Nam dui. Proin leo odio, porttitor id, consequat in, consequat ut, nulla. Sed accumsan felis. Nulla ut erat id mauris vulputate elementum. Nullam varius.",  1,  "https://www.melburyandappleton.co.uk/ekmps/shops/melburyapple/images/taleggio-dop-500g-4422-p.jpg",  true));
        snacks.put(8L, new Snack(8, "Cheese - Brie",  "Nam dui. Nam dui. Proin leo odio, porttitor id, consequat in, consequat ut, nulla. Sed accumsan felis. Proin leo odio, porttitor id, consequat in, consequat ut, nulla. Sed accumsan felis.",  26,  "https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/Brie_01.jpg/1200px-Brie_01.jpg",  false));
        snacks.put(9L, new Snack(9, "Tea - Darjeeling, Azzura",  "Phasellus sit amet erat. Nam dui. Proin leo odio, porttitor id, consequat in, consequat ut, nulla. Sed accumsan felis. Nulla tempus. Vivamus in felis eu sapien cursus vestibulum.",  18,  "https://www.udyantea.com/media/catalog/product/cache/1/image/1800x/af097278c5db4767b0fe9bb92fe21690/c/a/castleton_muscatel_gold_black_tea_01.jpg",  true));
        snacks.put(10L, new Snack(10, "Veal Chops", "In est risus, auctor sed, tristique in, tempus sit amet, sem. Nam dui. Proin leo odio, porttitor id, consequat in, consequat ut, nulla. Sed accumsan felis. Fusce consequat. Nulla nisl.",  24,  "https://foodsogoodmall.com/wp-content/uploads/2014/05/Pan-Seared-Oven-Roasted-Veal-Chops.jpg",  true));

    }




    public List<Snack> getAllSnacks() {
        return new ArrayList<Snack>(snacks.values());
    }

    public List<Snack> getFeatured() {
        ArrayList featuredSnacks = new ArrayList<Snack>();
        Random rand = new Random();

        featuredSnacks.add(snacks.get((long)rand.nextInt(10)));
        featuredSnacks.add(snacks.get((long)rand.nextInt(10)));
        featuredSnacks.add(snacks.get((long)rand.nextInt(10)));
        return featuredSnacks;
    }

    public Snack getSnack(long id) {
        return snacks.get(id);
    }

    public Snack addSnack(Snack snack) {
        snack.setId(snacks.size() + 1);
        snacks.put(snack.getId(), snack);
        return snack;
    }

    public Snack updateSnack(Snack snack) {
        if(snack.getId() <= 0) {
            return null;
        }

        snacks.put(snack.getId(), snack);
        return snack;
    }

    public Snack removeSnack(long id) {
        return snacks.remove(id);
    }
}
