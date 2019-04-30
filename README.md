Pretty Prices
-------------

**Problem**

Converting between currencies can result in funny-looking results.

Suppose the exchange rate is 1.34 CA$ / US$.
A product that costs a familiar US$ 9.99, will cost CA$ 13.39. 
```
US$  9.99
 *   1.34
 -------
CA$ 13.39
```
Shoppers aren't always used to prices ending in 0.39!

How can we round prices to look "normal"?

**Goal**

Extend `PriceConverter.java` to return prices rounded...
1. up to the nearest quarter (ending in .00, .25, .50, .75)
   - e.g. `9.99 * 1.34 = 13.39 --> 13.50`
2. **up or down** to the nearest quarter. (Have the user specify.)
   - e.g. rounding down `9.99 * 1.34 = 13.39 --> 13.25`
3. up to the nearest **user-provided multiple** (e.g., nearest 0.10, 0,05, 0.20, ...)
   - e.g. rounding up to nearest 0.20 `9.99 * 1.34 = 13.39 --> 13.40`
4. up to **end in .99** cents (e.g. 13.39 -> 13.99)
   - e.g.  `9.99 * 1.34 = 13.39 --> 13.99`
   - Note: this is _not the same_ as rounding up to a multiple of 0.99 (why?)
5. up to end in **any amount**
   - e.g.  round to end in 0.13 `9.99 * 1.34 = 13.39 --> 14.13`


If you've done all the above, `PriceConverter.java` should be able to...
 - round either up or down
 - to a multiple of X
 - or to an ending of X
 
 ----
 
 **Useful commands**
 
 - Test: `mvn test`
 - Build: `mvn compile`
 - Run: `mvn exec:java -Dexec.mainClass="com.shopify.prettyprices.Main"`

 Alternately, without Maven magic, from `src/main/java` directory:
   - build: `javac com/shopify/prettyprices/*.java`
   - run: `java com.shopify.prettyprices.Main`
