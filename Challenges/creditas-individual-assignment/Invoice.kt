package challenge

import challenge.Order
import challenge.Address

data class Invoice(val order: Order) {
    val billingAddress: Address = order.address
    val shippingAddress: Address = order.address
}
