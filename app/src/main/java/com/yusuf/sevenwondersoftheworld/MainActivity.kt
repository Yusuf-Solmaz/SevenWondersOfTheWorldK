package com.yusuf.sevenwondersoftheworld

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.yusuf.sevenwondersoftheworld.adapter.WonderAdapter
import com.yusuf.sevenwondersoftheworld.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var colosseumInfo =
        "The Colosseum in Rome was built in the first century by order of the Emperor Vespasian. A feat of engineering, the amphitheater measures 620 by 513 feet (189 by 156 meters) and features a complex system of vaults."
    var greatWallInfo =
        "Great might be an understatement. One of the world’s largest building-construction projects, the Great Wall of China is widely thought to be about 5,500 miles (8,850 km) long; a disputed Chinese study, however, claims the length is 13,170 miles (21,200 km)."
    var chichenInfo =
        "Chichén Itzá is a Mayan city on the Yucatán Peninsula in Mexico, which flourished in the 9th and 10th centuries CE. Under the Mayan tribe Itzá—who were strongly influenced by the Toltecs—a number of important monuments and temples were built."
    var petraInfo =
        "The ancient city of Petra, Jordan, is located in a remote valley, nestled among sandstone mountains and cliffs. It was purported to be one of the places where Moses struck a rock and water gushed forth. Later the Nabataeans, an Arab tribe, made it their capital, and during this time it flourished, becoming an important trade center, especially for spices."
    var machuPicchuInfo =
        "This Incan site near Cuzco, Peru, was “discovered” in 1911 by Hiram Bingham, who believed it was Vilcabamba, a secret Incan stronghold used during the 16th-century rebellion against Spanish rule. Although that claim was later disproved, the purpose of Machu Picchu has confounded scholars. "
    var christTheRedeemerInfo =
        "Christ the Redeemer is the statue of Christ, one of the symbols of the city, located on Corcovado Mountain in Rio de Janeiro, Brazil. It is located in the lower part of the mountain in the Tijuca National Park."
    var tajMahalInfo =
        "This mausoleum complex in Agra, India, is regarded as one of the world’s most iconic monuments and is perhaps the finest example of Mughal architecture. It was built by Emperor Shah Jahān (reigned 1628–58) to honor his wife Mumtāz Maḥal (“Chosen One of the Palace”), who died in 1631 giving birth to their 14th child."

    lateinit var sevenWonderList: ArrayList<Wonder>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        sevenWonderList = ArrayList<Wonder>()

        val colosseum = Wonder("Colosseum", "Italy", colosseumInfo,R.drawable.chichen)
        val greatWall =
            Wonder("Great Wall of China", "China", greatWallInfo, R.drawable.greatwall)
        val chichen = Wonder("Chichén Itzá", "Mexico", chichenInfo, R.drawable.chichen)
        val petra = Wonder("Petra", "Jordan", petraInfo, R.drawable.petra)
        val machuPicchu =
            Wonder("Machu Picchu", "Peru", machuPicchuInfo, R.drawable.machupichu)
        val christTheRedeemer =
            Wonder("Christ the Redeemer", "Brazil", christTheRedeemerInfo, R.drawable.christ)
        val tajMahal = Wonder("Taj Mahal", "India", tajMahalInfo, R.drawable.tajmahal)

        sevenWonderList.add(colosseum)
        sevenWonderList.add(greatWall)
        sevenWonderList.add(chichen)
        sevenWonderList.add(petra)
        sevenWonderList.add(machuPicchu)
        sevenWonderList.add(christTheRedeemer)
        sevenWonderList.add(tajMahal)


        binding.recyclerView.layoutManager = LinearLayoutManager(this);
        val adapter = WonderAdapter(sevenWonderList)
        binding.recyclerView.adapter = adapter


    }
}