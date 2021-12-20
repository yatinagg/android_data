package com.yatinagg.mvvm_order_management.model

data class User(
    val id: Int,
    val name: String,
    val email: String
){
    override fun toString() = "$name $email"
}

data class Product(
    val id: Int,
    val name: String,
    val brand: String,
    val price: Int
){
    override fun toString() = "$name - $brand (Rs$price)"
}

data class Order(
    val id: Int,
    val user: User,
    val product: Product
)

val usersList = arrayListOf( "Olivia", "Liam", "Emma", "Noah", "Amelia", "Oliver", "Ava", "Elijah", "Sophia", "Lucas")//, "Charlotte", "Mason", "Isabella", "Levi", "Mia", "James", "Luna", "Mateo", "Harper", "Asher", "Gianna", "Benjamin", "Evelyn", "Aiden", "Aria", "Logan", "Ella", "Ethan", "Ellie", "Leo", "Mila", "Jack", "Camila", "Jackson", "Avery", "Leriel", "Ryilee", "Henry", "Layla", "Grayson", "Scarlett", "Wyatt", "Lily", "Carter", "Sofia", "Sebastian", "Nova", "William", "Aurora", "Daniel", "Abigail", "Owen", "Chloe", "Julian", "Riley", "Michael", "Hazel", "Ezra", "Nora", "Muhammad", "Zoey", "Alexander", "Isla", "Hudson", "Elizabeth", "Lincoln", "Penelope", "Luke", "Eleanor", "Gabriel", "Elena", "Samuel", "Madison", "Jacob", "Emilia", "Josiah", "Emily", "Jayden", "Eliana", "Maverick", "Maya", "David", "Willow", "Elias", "Stella", "Jaxon", "Violet", "Matthew", "Paisley", "Eli", "Addison", "Luca", "Everly", "Anthony", "Hannah", "Kai", "Litte", "Isaiah", "Ivy", "John")

val brandsList = arrayListOf("Amazon", "Apple", "Google", "Microsoft", "Tencent", "Facebook", "Alibaba", "Visa", "McDonald's", "MasterCard", "Moutai", "Nvidia", "Verizon", "AT&T", "IBM", "Coca-Cola", "Nike", "Instagram", "PayPal", "Adobe", "Louis Vuitton", "UPS", "Intel", "Netflix", "The Home Depot", "SAP", "Accenture", "Oracle", "Starbucks", "Walmart", "Xfinity", "Marlboro", "Disney", "Meituan", "Texas Instruments", "Salesforce", "Qualcomm", "Spectrum", "YouTube", "Chanel", "Cisco", "Samsung", "Hermes Paris", "JD.com", "TikTok", "T-Deutsche Telekom", "Tesla", "L\'Oreal", "Ping An", "Huawei", "Industrial and Commercial Bank of China", "Zoom", "Intuit", "LinkedIn", "Costco", "Gucci", "Advanced Micro Devices", "Tata Consultancy Services", "Xbox", "Vodafone", "American Express", "Wells Fargo", "RBC", "Toyota", "Haier", "HDFC Bank", "Mercedes-Benz", "China Mobile Limited", "Budweiser", "Xiaomi Technology", "BMW", "Dell Technologies", "Life Insurance Corporation of india", "J.P. Morgan", "Siemens", "FedEx", "Baidu", "UBER", "Adidas", "Chase", "Pinduoduo", "Snapchat", "ZARA", "IKEA", "UnitedHealthCare", "Lowe\'s", "AIA Group", "NTT Group", "Autodesk", "TD Bank Group", "Orange", "DHL", "Didi Chuxing", "China Construction Bank", "Pampers", "KE.com", "Commonwealth Bank of Australia", "Bank of America", "Spotify", "Colgate")

val productsList = arrayListOf("Tv", "Clock", "Bike", "Xbox 360", "Wii", "Spaghetti", "Batman", "Tim Drake", "Psyduck", "Michael Jackson", "Fire", "Wine", "Remote", "Couch", "Speaker", "Lightsaber", "Movie", "Door", "Pencil", "Penny Arcade", "Inspector Gadget", "Laptop", "Printer", "Pillow", "Deadly Premonition", "Water bottle", "Alcoholic Beverages", "Iron Man", "Headphones", "Giants", "Bomb", "Tubes", "Kung Fu Rider", "Joel Marlin", "Banana", "Orange", "Apple", "Hamburger", "Sandwich", "Egg", "Mass Effect 2", "Duracell Battery", "Cell Phone", "Gears of War 2", "Trumpet", "Drums", "Fried Chicken", "Trench Coat", "Top Hat", "Snowman", "Pickle", "Steak", "Hot Dog", "Potato", "Chips", "French Fries", "Window", "Kingdom Hearts", "Goblins", "Orcs", "Trolls", "Donkey Kong", "Link", "Ghost", "Jedi Exile", "Game & Watch Gallery 4", "Tamer", "Conveyor Belt", "Police Car", "Pool of Radiance", "Portal", "Bacon", "Toasty", "Toejam", "Earl", "Kyle Reese", "The Terminator", "Arnold Schwarzenegger", "Candle", "Green Lantern", "Cigar", "Dentist", "Cooler", "Pineapple", "Melon", "Button", "Spaceship", "Warhammer 40,000: Dawn of War II", "Shampoo", "Book", "Treasure Chest", "Pie", "Puzzles", "Slippy Toad", "Fox McCloud", "Falco Lombardi", "Peppy Hare", "Giant Donut", "Zombie")
