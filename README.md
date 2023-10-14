Task C:

    mainscreen.html
    Line 14: Changed the title of the shop.
    Line 19: Changed h1 element to shop name.
    Line 21: Changed "Parts" header to shop name.
    Line 53: Changed "Products" header to shop name.

Task D:

    mainscreen.html
    Line 20: Added hyperlink to direct user to about page.

    about.html
    Lines 1-13: Generic about page giving insight about the shop.

    aboutController.java
    Lines 1-13: Created a mapping to render the about.html page.

Task E:

    BootStrapData.java
    
    Lines 58-100: Added 5 parts and saved them to repo and added logic to check the count.
    Lines 109-118: Added 5 products and saved them to the repo and added logic to check the count.

Task F:

    mainscreen.html
    Line 86: Created "Buy Now" button.

    confirmationbuyproduct.html
    Lines 1-12: Created success message.

    purchaseerror.html
    Lines 1-12: Created error message.

    Product.java
    Lines 108-115: logic to check and decrement product. 
    
    AddProductController.java
    Lines 172-182: add mapping for buy now feature. This handles success and error routing.
    
Task G:

    mainscreen.html
    Lines 39-40: Add minimum and maximum headers
    Lines 49-50: Add table data for minimum and maximum

    Part.java
    Lines 31-33: Initialize min and max values
    Lines 95-102: Validate the min and max limits
    Lines 113-117: Getters and setters for min and max

    InhousePart.java AND OutsourcedPart.java
    Lines 18-19: set min = 0 and max = 100

    InhousePartForm.html AND OutsourcedPartForm.html 
    Lines 25-35: added input fields to allow users to set min and max.

    application.properties
    Line 6: defined absolute path for persistent storage.

    InhousePartServiceImpl.java AND OutsourcedPartServiceImpl.java
    Line 54: call method that validates min and max thresholds.

Task H:
    
    Part.java
    Lines 19-20: validation for min and max fields

    PartInventoryMinimumValidator.java AND ValidPartInventoryMinimum:
    new files that display errors when the inventory is low or if inventory is less than number of required parts.

***NOTE: No validator is included for  because section F's requirements specify that the "Buy Now" button should not affect the inventory of the associated parts.
    to implement this functionality, I would have had to make changes to the buyProduct() function I created, so that it also reduces the inventory of the associated parts as follows:

    public boolean buyProduct() {
    if (this.inv < 1) {
        return false;
    }

    for (Part part : this.getParts()) {
        if (part.getInv() < 1) {
            return false;
        }
    }

    this.inv--;
    for (Part part : this.getParts()) {
        part.setInv(part.getInv() - 1);
    }
    
    return true;
    }
    Subsequently, I could have updated the error template to display the validation error that would have been triggered by the PartInventoryMinimumValidator.


    PartInventoryValidator AND ValidPartInventory.java:
    new files that display errors when adding or updating when beyond maximum amount.

Task I:
    
    PartTest.java
    Lines 160-177: Two tests that check min and max fields.

Task J:

    Removed DeletePartValidator.java as it's not being referenced anywhere in the project.

