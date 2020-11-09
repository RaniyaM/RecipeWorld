package com.example.recipeworld;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

    List<Recipe> recipe1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipe1 = new ArrayList<>();
        recipe1.add(new Recipe("Chicken pot pie", "\n" +
                "1 box Pillsbury™ refrigerated pie crusts, softened as directed on box\n" +
                "\n" +
                "1/3 cup butter or margarine\n" +
                "\n" +
                "1/3 cup chopped onion\n" +
                "\n" +
                "1/3 cup all-purpose flour\n" +
                "\n" +
                "1/2 teaspoon salt\n" +
                "\n" +
                "1/4 teaspoon pepper\n" +
                "\n" +
                "1 3/4 cups Progresso™ chicken broth (from 32-oz carton)\n" +
                "\n" +
                "1/2 cup milk\n" +
                "\n" +
                "2 1/2 cups shredded cooked chicken or turkey SAVE $\n" +
                "\n" +
                "2 cups frozen mixed vegetables, thawed","Method", "One of our most popular and top-rated meals of all time, this classic chicken pot pie recipe has a flaky, buttery crust, a creamy sauce, and a hearty mix of chicken and whatever vegetables your family loves. Plus, this homemade chicken pot pie is super easy to make, which makes it a great recipe for beginner cooks and busy families alike." + "\n","/n" );+ "1   Heat oven to 425°F. Prepare pie crusts as directed on box for Two-Crust Pie using 9-inch glass pie pan.\u2028\t\u20282   In 2-quart saucepan, melt butter over medium heat. Add onion; cook 2 minutes, stirring frequently, until tender. Stir in flour, salt and pepper until well blended. Gradually stir in broth and milk, cooking and stirring until bubbly and thickened.\u2028\n" +
                "3    Stir in chicken and mixed vegetables. Remove from heat. Spoon chicken mixture into crust-lined pan. Top with second crust; seal edge and flute. Cut slits in several places in top crust.\n" +
                "\n" +
                "4    Bake 30 to 40 minutes or until crust is golden brown. During last 15 to 20 minutes of baking, cover crust edge with strips of foil to prevent excessive browning. Let stand 5 minutes before serving.\n",R.drawable.chicken_pot_pie));


        myrecyclerView = (RecyclerView) findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this,recipe1);

        myrecyclerView.setLayoutManager(new GridLayoutManager(this, 1));

        myrecyclerView.setAdapter(myAdapter);
    }




}
