# Review of delivery partner based on rating

Write a query to display partner id,partner name and review of the delivery partner, give alias name for partner review as 'REVIEW', sort the result based on partner id in ascending order.

*Note: Review is based on the following condition*

    IF rating>=4 then 'GOOD'

    IF rating between >=2 and <4 then 'AVERAGE'

    IF rating <2 then 'WORST'

> HINT : Use Delivery_partners table to retrieve records.