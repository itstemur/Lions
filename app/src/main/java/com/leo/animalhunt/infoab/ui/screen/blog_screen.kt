package com.tz.btmonitor.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.leo.animalhunt.infoab.R


@Preview
@Composable
fun BlogScreenPreview() {
    BlogContent(index = 0) {}
}

@Composable
fun BlogScreen(navController: NavController, index: Int) {
    BlogContent(index = index) {
        navController.popBackStack()
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BlogContent(
    index: Int, onBackPresssed: () -> Unit
) {
    val body_0 =
        "In Africa, lions are emblematic of the continent\'s wild beauty and are recognized for their majestic presence across various habitats. The African lion, scientifically known as Panthera leo, is typically what people think of when they consider lions in Africa. However, within the continent, there are subtle variations among lion populations based on their geographical locations.\nThe East African lion (Panthera leo nubica), found in East Africa from Ethiopia and Kenya to Tanzania, is known for its large size and the iconic manes of the males, which can vary in color from light to dark. These lions are predominantly found in savannahs and grasslands, where they prey on a variety of animals from zebras to buffaloes.\nThe Southern African lion (Panthera leo melanochaita), found in Southern African countries such as Botswana, Namibia, South Africa, and Zimbabwe, is another subspecies. These lions have adapted to a range of habitats including deserts, like the Kalahari Desert, showcasing the species' adaptability.\nWest African lions (Panthera leo leo), with a smaller population size, are found in West Africa's fragmented and isolated regions. They are listed as critically endangered, with populations facing significant threats from habitat loss, human-wildlife conflict, and reduced prey availability.\nConservation efforts are crucial for the survival of these magnificent animals, focusing on habitat restoration, protection from poaching, and mitigating human-lion conflicts. The distinction between these lion populations in Africa highlights the need for region-specific conservation strategies to preserve the future of one of the continent's most iconic species."
    val body_1 =
        "Lions, known for their majestic presence and royal demeanor, are one of the most iconic species in the animal kingdom. Currently, lions are broadly classified into two main groups based on genetic research: Panthera leo leo, which includes the Asiatic lion and the lions found in West and Central Africa, and Panthera leo melanochaita, which comprises the lions in Eastern and Southern Africa.\nThe Asiatic lion, a subspecies of Panthera leo leo, is found in India\'s Gir Forest, a stark contrast to the African lions\' vast range. These lions are smaller and have less pronounced manes compared to their African counterparts.\nAfrican lions (Panthera leo) vary across the continent, with notable subspecies including the Katanga lion found in Southwest Africa, the Masai lion in East Africa, and the now-extinct Barbary lion, which once roamed North Africa. Each subspecies adapted to its specific environment, displaying slight variations in size, mane appearance, and behavior.\nThe white lion is a rare color mutation found in some lion populations, particularly in the Timbavati region of South Africa. These lions are not considered a separate subspecies but are highly sought after for their unique appearance.\nConservation efforts are crucial for the survival of all lion subspecies, as they face threats from habitat loss, human conflict, and declining prey populations. Protecting these magnificent creatures requires international cooperation and effective conservation strategies to ensure they continue to thrive in the wild.\n\nLions, known as \"King of the Jungle,\" are fascinating animals with a presence that commands respect across the animal kingdom. These majestic creatures belong to the genus Panthera and are native to Africa and India. They are distinguished by their muscular, broad-chested bodies, short, rounded heads, and of course, the male's iconic mane which symbolizes strength and dominance.\nHistorically, lions were classified into several subspecies, but recent genetic research has simplified their classification into two main groups: Panthera leo leo, which comprises Asiatic lions and the lions found in West and Central Africa, and Panthera leo melanochaita, which includes the lions of Eastern and Southern Africa. The Asiatic lion, residing in India's Gir Forest, is the only lion population outside of Africa. Despite their grandeur, lions face the threat of habitat loss and conflict with humans, making conservation efforts crucial for their survival.\nNotable types of lions mentioned in literature include the Katanga lion from Southwest Africa, the Masai lion of East Africa, and the Barbary lion, which once roamed North Africa but is now considered extinct in the wild. Additionally, the white lion, a rare color mutation observed in some lion populations, particularly in the Timbavati region of South Africa, captivates many with its unique appearance, though it is not a separate subspecies.\nEfforts to protect and conserve lions are vital, as these magnificent animals play a crucial role in their ecosystems. Protecting lions involves habitat restoration, mitigating human-lion conflicts, and ensuring sustainable tourism practices that respect their natural environments."
    val body_2 =
        "The lion population across the globe, particularly in Africa, is facing significant challenges. Recent analyses have highlighted the dire situation, revealing a substantial decline in the lion\'s historical range. Currently, the extant range of lions is estimated to be only 7.4 percent of what it once was, marking an estimated 36 percent decline in recent years. This drastic reduction in habitat, coupled with other threats such as poaching and conflict with humans, places numerous lion populations at risk of disappearing.\nIn terms of numbers, the lion population has experienced a catastrophic decrease. From an estimated 200,000 lions a century ago, the population has dwindled to about 24,000 lions remaining today. This represents a staggering range reduction of 95 percent, underscoring the urgent need for conservation efforts. The situation is particularly acute in West and Central Africa, where lion subpopulations are critically endangered, with West Africa having approximately 500 lions and Central Africa around 2,200.\nThe complexities in estimating lion populations accurately add another layer of challenge to conservation efforts. The most commonly cited estimate suggests there are around 20,000 lions left in Africa, but the actual number remains uncertain due to the difficulties in conducting comprehensive surveys. This uncertainty complicates the implementation of effective conservation strategies, making it crucial for continued research and investment in conservation initiatives to protect these majestic animals and ensure their survival for future generations."
    val body_3 =
        "The \"Red Book\" typically refers to the IUCN Red List of Threatened Species, which is a comprehensive, global inventory of the conservation status of biological species. While the search results provided don\'t directly mention lions in the context of the Red Book or IUCN Red List, we can draw upon general knowledge about lions and their conservation status from recognized sources like the World Wildlife Fund (WWF) and National Geographic.\nLions (Panthera leo) are listed as \"Vulnerable\" on the IUCN Red List, reflecting a population that is facing a high risk of extinction in the wild. The decline in lion populations is attributed to several factors, including habitat loss, human-wildlife conflict, and reductions in their prey base due to poaching and other forms of hunting. These majestic creatures have seen their numbers and range significantly reduced across Africa and Asia over the past few decades.\nConservation efforts for lions are crucial to prevent their further decline and to work towards population recovery. These efforts include habitat restoration, the establishment of protected areas, conflict mitigation strategies between lions and humans, and anti-poaching initiatives. Organizations like the WWF and various national and international conservation agencies are actively involved in such efforts, aiming to secure a future for these iconic animals in their natural habitats."
    val body_4 =
        "Lions are renowned for their hunting prowess, characterized by a blend of strength, strategy, and teamwork. They employ various tactics to catch their prey, often relying on the element of surprise. Lions either ambush their prey by waiting in concealment or stealthily approach to within striking distance before making a sudden charge, typically over a distance of less than 50 meters to ensure a high chance of success. This approach allows them to conserve energy and increase their chances of a successful hunt.\nThe lionesses within a pride are usually the primary hunters, taking advantage of their agility and smaller size to maneuver closer to potential prey. They often hunt in groups, coordinating their movements to encircle prey before launching an attack. This cooperative hunting strategy not only increases their success rate but also allows them to take down larger animals that would be too challenging for a single lion. The roles during these hunts are often divided, with some lionesses acting as \"wings\" to herd the prey towards the center where other members wait to ambush.\nDespite their strength and advanced hunting techniques, lions rely heavily on their sensory perceptions to detect prey, often triggered by the sounds of animals moving. Their acute hearing and sight play a critical role in locating potential meals, enabling them to respond quickly to opportunities that arise. This sensory acumen, combined with their strategic hunting methods and physical capabilities, cements lions' status as apex predators in their natural habitats."

    val (image, title, body) = when (index) {
        0 -> Triple(
            first = R.drawable.strongest_types_of_lions,
            second = stringResource(id = R.string.title_0),
            third = body_0
        )

        1 -> Triple(
            first = R.drawable.types_of_lions,
            second = stringResource(id = R.string.title_1),
            third = body_1
        )

        2 -> Triple(
            first = R.drawable.white_lion,
            second = stringResource(id = R.string.title_2),
            third = body_2
        )

        3 -> Triple(
            first = R.drawable.lions_we_must_save,
            second = stringResource(id = R.string.title_3),
            third = body_3
        )

        else -> Triple(
            first = R.drawable.lionhunt,
            second = stringResource(id = R.string.title_4),
            third = body_4
        )
    }


    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Lions") },
                navigationIcon = {
                    IconButton(onClick = onBackPresssed) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "back button"
                        )
                    }
                }
            )
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(top = it.calculateTopPadding())
                .padding(16.dp)
        ) {

            Image(
                painter = painterResource(id = image),
                contentDescription = "Lion Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .clip(shape = RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = title,
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp
                ),
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = body,
                style = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 23.sp
                ),
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}
