package com.example.mymovie.model

data class Movie(val id: String,
            val title: String,
            val year:String,
            val genre:String,
            val director:String,
            val actors:String,
            val plot:String,
            val poster: String,
            val images:List<String>,
            val rating: String)

fun getMovies(): List<Movie>{
    return listOf(
        Movie(id = "ttytye5",
        title = "Saving Private Ryan",
        year = "1998",
        genre = "War",
        director = "Steven Spielberg",
        actors = "Tom Hanks",
        plot = "Captain John Miller (Tom Hanks) takes his men behind enemy lines to find Private James Ryan, whose three brothers have been killed in combat. Surrounded by the brutal realties of war, while searching for Ryan, each man embarks upon a personal journey and discovers their own strength to triumph over an uncertain future with honor, decency and courage.",
        poster="https://www.imdb.com/title/tt0120815/mediaviewer/rm1924732160/?ref_=tt_ov_i",
        images = listOf("https://previews.agefotostock.com/previewimage/medibigoff/8259be6fa6d486865f5074a525025c99/uai-01363564.jpg",
                        "https://imgtoolkit.culturebase.org/?color=FFFFFF&quality=8&ar_ratio=1.3&format=jpg&file=https%3A%2F%2Fimg.culturebase.org%2Fc%2Fa%2F3%2F0%2F2%2Fpic_1506678731_ca302087837e7a3a6eccfe36d0432b2a.jpeg&do=cropOut&width=1200&height=585",
                        "https://www.intofilm.org/intofilm-production/scaledcropped/970x546https%3A/s3-eu-west-1.amazonaws.com/images.cdn.filmclub.org/film__2925-saving-private-ryan--hi_res-67979936.jpg/film__2925-saving-private-ryan--hi_res-67979936.jpg"
            ),
        rating = "8.6"),

        Movie(id = "ttytye7",
            title = "Life of Pie",
            year = "2012",
            genre = "Adventure",
            director = "Ang Lee",
            actors = "Suraj Sharma",
            plot = "After deciding to sell their zoo in India and move to Canada, Santosh and Gita Patel board a freighter with their sons and a few remaining animals. Tragedy strikes when a terrible storm sinks the ship, leaving the Patels' teenage son, Pi (Suraj Sharma), as the only human survivor. However, Pi is not alone; a fearsome Bengal tiger has also found refuge aboard the lifeboat.",
            poster="https://www.imdb.com/title/tt0454876/mediaviewer/rm763276032/?ref_=tt_ov_i",
            images = listOf("https://collider.com/wp-content/uploads/life-of-pi-banner-image-4.jpg",
                             "https://prdaficalmjediwestussa.blob.core.windows.net/images/2020/07/AFI20_LIFE_OF_PI_Blog_image.jpg",
                             "https://www2.bfi.org.uk/sites/bfi.org.uk/files/styles/full/public/image/life-of-pi-2012-005-afloat-on-luminous-raft-at-night.jpg?itok=k4BKfdqM",
                             "https://steemitimages.com/DQmQU8gjLo9AbUK7XjZgzEnm54RdKND2YvrdVKiscwcMaSp/pi5.jpg",
            ),
            rating = "7.9"),

        Movie(id = "ttytye4",
            title = "Hackshaw Ridge",
            year = "2016",
            genre = "War",
            director = "Mel Gibson",
            actors = "Andrew Garfield",
            plot = "The true story of Pfc. Desmond T. Doss (Andrew Garfield), who won the Congressional Medal of Honor despite refusing to bear arms during WWII on religious grounds. Doss was drafted and ostracized by fellow soldiers for his pacifist stance but went on to earn respect and adoration for his bravery, selflessness and compassion after he risked his life -- without firing a shot -- to save 75 men in the Battle of Okinawa.",
            poster="https://www.imdb.com/title/tt2119532/mediaviewer/rm2660241152/?ref_=tt_ov_i",
            images = listOf("https://w0.peakpx.com/wallpaper/225/618/HD-wallpaper-2016-military-hacksaw-ridge-poster-drama-film-biography.jpg",
                            "https://cdn.vox-cdn.com/thumbor/dQzd2hNI8eQ2vOCM8YN_umlgO0s=/0x0:2500x1667/1220x813/filters:focal(1930x194:2330x594):format(webp)/cdn.vox-cdn.com/uploads/chorus_image/image/51678749/hacksaw2.0.jpg",
                            "https://cdn.vox-cdn.com/thumbor/itKFJYPEuEuEiW8-tqKsVt6wDxc=/0x0:2048x1365/1320x0/filters:focal(0x0:2048x1365):format(webp):no_upscale()/cdn.vox-cdn.com/uploads/chorus_asset/file/7405049/hacksaw1.jpg",),
            rating = "8.1"),

        Movie(id = "ttytye9",
            title = "1917",
            year = "2019",
            genre = "War Drama",
            director = "Sam Mendes",
            actors = "George MacKay",
            plot = "During World War I, two British soldiers -- Lance Cpl. Schofield and Lance Cpl. Blake -- receive seemingly impossible orders. In a race against time, they must cross over into enemy territory to deliver a message that could potentially save 1,600 of their fellow comrades -- including Blake's own brother.",
            poster="https://www.imdb.com/title/tt8579674/mediaviewer/rm144738817/?ref_=tt_ov_i",
            images = listOf("https://upload.wikimedia.org/wikipedia/en/f/fe/1917_%282019%29_Film_Poster.jpeg",
                           "https://cdn.vox-cdn.com/thumbor/cPFCoD8w7969SmsRpdfCcGXxDnQ=/0x0:1200x675/1220x813/filters:focal(519x17:711x209):format(webp)/cdn.vox-cdn.com/uploads/chorus_image/image/65993409/19171.0.jpg",
                           "https://cdn.vox-cdn.com/thumbor/VQ2SGdHmlXy31rhvoTn14bh1VDI=/0x0:1600x720/1320x0/filters:focal(0x0:1600x720):format(webp):no_upscale()/cdn.vox-cdn.com/uploads/chorus_asset/file/19545788/19177.jpg",),
            rating = "8.2"),

        Movie(id = "ttytye11",
            title = "Blade Runner 2049",
            year = "2017",
            genre = "Sci-fi",
            director = "Denis Villeneuve",
            actors = "Ryan Gosling",
            plot = " Officer K (Ryan Gosling), a new blade runner for the Los Angeles Police Department, unearths a long-buried secret that has the potential to plunge what's left of society into chaos. His discovery leads him on a quest to find Rick Deckard (Harrison Ford), a former blade runner who's been missing for 30 years.",
            poster="https://www.imdb.com/title/tt1856101/mediaviewer/rm2677875712/?ref_=tt_ov_i",
            images = listOf("https://external-preview.redd.it/JiTihinToeoFhz55uvnEPlFrI33Jo_VTYyNAZwuO5Nc.jpg?auto=webp&s=f12a173803b8a04e9d8ae61d74bae42379dfd9a3",
                            "https://cdn.vox-cdn.com/thumbor/P-Zghl-CFkPpo2ldTohq8rQV8fo=/0x0:2400x1800/1220x813/filters:focal(1231x0:1615x384):format(webp)/cdn.vox-cdn.com/uploads/chorus_image/image/56977603/bladecover.0.jpg",
                             "https://cdn.vox-cdn.com/uploads/chorus_asset/file/9376591/blade3.jpg",
                            "https://cdn.vox-cdn.com/uploads/chorus_asset/file/9376599/blade2.png"  ,

            ),
            rating = "8.0"),




    )
}
