package az.mb.exbtestapp.common

import az.mb.exbtestapp.R
import az.mb.exbtestapp.domain.model.Card
import az.mb.exbtestapp.domain.model.Category
import az.mb.exbtestapp.domain.model.Transaction
import az.mb.exbtestapp.ui.theme.Blue
import az.mb.exbtestapp.ui.theme.Gray2
import az.mb.exbtestapp.ui.theme.Purple
import az.mb.exbtestapp.ui.theme.Purple2
import az.mb.exbtestapp.ui.theme.Red
import az.mb.exbtestapp.ui.theme.SkyBlue
import az.mb.exbtestapp.ui.theme.SkyBlue2

object FakeDb {
    var arrayYear = arrayOf(2020, 2021, 2022, 2023)
    var arrayMonth = arrayOf("January", "February", "March", "April", "May", "June", "July")
    var arrayCards = arrayOf("Expresso MC  ** 4554", "Expresso MC  ** 3362", "Expresso MC  ** 2212")
    private var categories: List<Category> = listOf(
        Category(
            id = 1,
            name = "Airlines",
            color = SkyBlue,
            percent = "22%",
            expenseAmount = "1 200 AZN",
            iconId = R.drawable.ic_plane,
            transactions = listOf(
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                )
            )
        ),
        Category(
            id = 2,
            name = "Rent A Car",
            color = Purple,
            percent = "28%",
            expenseAmount = "1 100 AZN",
            iconId = R.drawable.ic_rent_car,
            transactions = listOf(
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                )
            )
        ),
        Category(
            id = 3,
            name = "Hotels And Motels",
            color = Purple2,
            percent = "18%",
            expenseAmount = "1 600 AZN",
            iconId = R.drawable.ic_hotel,
            transactions = listOf(
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                )
            )
        ),
        Category(
            id = 4,
            name = "Transport",
            color = Red,
            percent = "34%",
            expenseAmount = "1 000 AZN",
            iconId = R.drawable.ic_transport,
            transactions = listOf(
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                )
            )
        ),
        Category(
            id = 5,
            name = "Cars And Vehicles",
            color = Blue,
            percent = "22%",
            expenseAmount = "1 500 AZN",
            iconId = R.drawable.ic_car,
            transactions = listOf(
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                )
            )
        ),
        Category(
            id = 6,
            name = "Government Services",
            color = Gray2,
            percent = "22%",
            expenseAmount = "1 500 AZN",
            iconId = R.drawable.ic_government,
            transactions = listOf(
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                )
            )
        ),
        Category(
            id = 7,
            name = "Personal Services",
            color = SkyBlue2,
            percent = "22%",
            expenseAmount = "1 500 AZN",
            iconId = R.drawable.ic_person,
            transactions = listOf(
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                )
            )
        ),
    )
    private var categories2: List<Category> = listOf(
        Category(
            id = 1,
            name = "Airlines",
            color = SkyBlue,
            percent = "18%",
            expenseAmount = "1 800 AZN",
            iconId = R.drawable.ic_plane,
            transactions = listOf(
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                )
            )
        ),
        Category(
            id = 2,
            name = "Rent A Car",
            color = Purple,
            percent = "28%",
            expenseAmount = "1 700 AZN",
            iconId = R.drawable.ic_rent_car,
            transactions = listOf(
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                )
            )
        ),
        Category(
            id = 3,
            name = "Hotels And Motels",
            color = Purple2,
            percent = "18%",
            expenseAmount = "1 300 AZN",
            iconId = R.drawable.ic_hotel,
            transactions = listOf(
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                )
            )
        ),
        Category(
            id = 4,
            name = "Transport",
            color = Red,
            percent = "34%",
            expenseAmount = "2 000 AZN",
            iconId = R.drawable.ic_transport,
            transactions = listOf(
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                )
            )
        ),
        Category(
            id = 5,
            name = "Cars And Vehicles",
            color = Blue,
            percent = "22%",
            expenseAmount = "1 500 AZN",
            iconId = R.drawable.ic_car,
            transactions = listOf(
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                )
            )
        ),
        Category(
            id = 6,
            name = "Government Services",
            color = Gray2,
            percent = "22%",
            expenseAmount = "1 500 AZN",
            iconId = R.drawable.ic_government,
            transactions = listOf(
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                )
            )
        ),
        Category(
            id = 7,
            name = "Personal Services",
            color = SkyBlue2,
            percent = "22%",
            expenseAmount = "1 500 AZN",
            iconId = R.drawable.ic_person,
            transactions = listOf(
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                )
            )
        ),
    )
    private var categories3: List<Category> = listOf(
        Category(
            id = 1,
            name = "Airlines",
            color = SkyBlue,
            percent = "22%",
            expenseAmount = "1 500 AZN",
            iconId = R.drawable.ic_plane,
            transactions = listOf(
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                )
            )
        ),
        Category(
            id = 2,
            name = "Rent A Car",
            color = Purple,
            percent = "28%",
            expenseAmount = "1 700 AZN",
            iconId = R.drawable.ic_rent_car,
            transactions = listOf(
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                )
            )
        ),
        Category(
            id = 3,
            name = "Hotels And Motels",
            color = Purple2,
            percent = "18%",
            expenseAmount = "1 300 AZN",
            iconId = R.drawable.ic_hotel,
            transactions = listOf(
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                )
            )
        ),
        Category(
            id = 4,
            name = "Transport",
            color = Red,
            percent = "34%",
            expenseAmount = "2 000 AZN",
            iconId = R.drawable.ic_transport,
            transactions = listOf(
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                )
            )
        ),
        Category(
            id = 5,
            name = "Cars And Vehicles",
            color = Blue,
            percent = "22%",
            expenseAmount = "1 500 AZN",
            iconId = R.drawable.ic_car,
            transactions = listOf(
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                )
            )
        ),
        Category(
            id = 6,
            name = "Government Services",
            color = Gray2,
            percent = "22%",
            expenseAmount = "1 500 AZN",
            iconId = R.drawable.ic_government,
            transactions = listOf(
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                )
            )
        ),
        Category(
            id = 7,
            name = "Personal Services",
            color = SkyBlue2,
            percent = "22%",
            expenseAmount = "1 500 AZN",
            iconId = R.drawable.ic_person,
            transactions = listOf(
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ),
                Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                ), Transaction(
                    title = "Uber Trip 20 UAW",
                    iconId = R.drawable.img_uber,
                    amount = "100 $",
                    date = "10.03.2022",
                    time = "10:03"
                )
            )
        ),
    )


    private var card1 =
        Card("Expresso MC  ** 4554", "1 300 000", "1 700 000", "100 500", categories)
    private var card2 =
        Card("Expresso MC  ** 3362", "1 530 000", "1 230 000", "120 300", categories2)
    private var card3 =
        Card("Expresso MC  ** 2212", "1 433 000", "1 670 000", "190 100", categories3)
    var cards: List<Card> = listOf(card1, card2, card3)


}