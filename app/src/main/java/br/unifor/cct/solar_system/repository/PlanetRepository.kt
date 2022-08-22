package br.unifor.cct.solar_system.repository

import br.unifor.cct.solar_system.R
import br.unifor.cct.solar_system.model.Planet

object PlanetRepository {

    fun findAll():List<Planet>{
        return listOf(
            Planet(1, R.drawable.image1, "Sol", "1.9891 x 10^30 Kg", "1.408 Kg/m3", "1.392.000 Km", "A estrela central e principal fonte de energia do Sistema Solar",
                "O Sol é a estrela central do Sistema Solar, que exerce o dominio gravitacional sobre os demais corpos celestes.\n Sua composição é de 74% de Hidrogênio e 24% de Hélio.\n Estima-se que o Sol tenha 4,6 bilhões de anos e que em 7 bilhões de anos ele se torne uma gigante vermelha\n Sua temperatura é bastante variada pela fusão que ocorre em todo seu sistema, mas o nucleo pode chegar a 15 Milhões de Kelvin"),
            Planet(2, R.drawable.image2, "Mercúrio", "0.3302 * 10^23 Kg", "5.427 Kg/m3", "4.880 Km", "O planeta mais proximo do Sol",
                "Sendo o planeta mais proximo do Sol, ele é um dos astros mais brilhantes vistos na Terra.\n Sua superficie é repleta de crateras, enquanto seu nucleo é rico em ferro.\n A composição do planeta é por grande parte de 98% hélio e 2% hidrogênio.\n"),
            Planet(3, R.drawable.image3, "Vênus", "4.8685 * 10^24 Kg", "5.204 kg/m3", "13.004 Km", "O planeta que possui similaridades com a Terra",
                "Conhecida como Estrela D'alva por ser um dos astros noturnos mais brilhantes.\n Possui tamanho e massa similares a da Terra porém difere em condições de sobrevivencia.\n O planeta é 92 vezes mais densa que a Terra e é coberto quase sempre por nuvens.\n"),
            Planet(4, R.drawable.image4, "Terra", "5.9736 * 10^24 kg", "5.515 kg/m3", "12.756 km", "O planeta que habita os seres vivos",
                "O planeta que as suas condições e caracteristicas que permitiram a evolução dos seres vivos.\n Possui um satélite natural, a Lua que é responsavel pela correntes maritimas.\n A estrutura do Planeta é composta por Nucleo, Manto e Crosta Terrestre.\n"),
            Planet(5, R.drawable.image5, "Marte", "0.6418 * 10^24 Kg", "3.933 kg/m3", "6.796 km", "O planeta desértico que provavelmente habitado por Extraterrestres",
                "É o planeta que possui climas parecidos com o da Terra.\n Sua superficie levou cientistas a considerarem existencia de vida no planeta.\n A temperatura do Planeta pode variar entre -76ºC a -10ºC.\n Sua superficie é caracterizada por Magnetite que da uma cor avermelhada ao solo marciano.\n"),
            Planet(6, R.drawable.image6, "Jupíter", "1898.6 * 10^24 Kg", "1.326 kg/m3", "142.984 km", "O planeta que exibe peculiares faixas multicoloridas",
                "Conhecido como o Gigante Gasoso, sendo o Maior Planeta com maior velocidade de Rotação.\n Apesar de maior massa, ele é menos denso, visto que sua composição é mais gasosa.\n Acredita-se que o planeta possua um nucleo rochoso, mas não sabe-se ao certo se a uma superficie definida.\n"),
            Planet(7, R.drawable.image7, "Saturno", "568.46 * 10^24 Kg", "687 kg/m3", "120.536 km", "O planeta que é semelhante a Jupíter e tem um sistema de anéis únicos",
                "O Segundo Maior Planeta, é conhecido por possui um sistema de aneis e acredita-se que seus aneis são composto por gelo.\n Possui um unico Satelite conhecido como Titão.\n A atmosfera é constituida de Helio e Hidrogenio, e sua densidade é inferior a da Terra.\n Há indicios que o planeta possua um nucleo solido.\n"),
            Planet(8, R.drawable.image8, "Urano", "86.810 * 10^24 Kg", "1.270 kg/m3", "51.118 km", "O planeta que foi o primeiro descoberto com um telescópio",
                "O planeta com pouca Luminosidade e apresent massa menor que Jupíter, porém seu nucleo é o mais denso.\n O planeta possui 27 Satelites naturais e 27 Luas.\n Sua atmosfera é composta por hidrogenio,helio e metano, sendo o ultimo responsavel pela cor azulada.\n Sua temperatura é de aproximadamente -218ºC"),
            Planet(9, R.drawable.image9, "Netuno", "102.43 * 10^24 Kg", "1.683 kg/m3", "49.528 km", "O planeta mais afastado do Sol e conhecido como o gigante gelado",
                "O Ultimo planeta do Sistema Solar, sua composição atmosferica e de massa são semelhantes a Urano.\n Sua atmosfera é composta igualmente a de Urano e sua temperatura chega em media do mesmo planeta.\n Possui 13 Satelites, sendo o maior conhecido como Tritão.\n"),
            Planet(10, R.drawable.image10, "Plutão", "1,305 * 10^22", "1.880 Kg/m3", "2.374 Km", "O planeta que foi considerado como o Menor dentro do Sistema Solar",
                "Foi considerado um planeta do Sistema Solar até 2006.\n É o maior planeta Anão conhecido e possui 5 Luas, sendo que a maior delas, Charon que possui metade do seu tamanho.\n A orbita de Plutão não é circular, por esse motivo em certas ocasiões ele fica mais proximo do Sol, que seu vizinho Netuno\n"),
            Planet(11, R.drawable.image11, "Erís", "1,66 * 10^22", "2.520 Kg/m3", "2.326 Km", "O planeta que foi descoberto pertencer ao membro de cinturão de asteroides",
                "Foi considerado o 10º planeta do Sistema Solar, na epoca de sua descoberta.\n Era considerado maior que Plutão, mas com medidas modernas mostrou-se o contrario.\n Apesar de ser menor que Plutão, é 25% mais massivo.\n Batizado em homenagem a deusa grega da discordia.\n")
        )
    }
}