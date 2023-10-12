package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        OutsourcedPart hudsonWheels = new OutsourcedPart();
        hudsonWheels.setCompanyName("Hudson");
        hudsonWheels.setName("hudson wheels");
        hudsonWheels.setInv(5);
        hudsonWheels.setPrice(20.0);
        hudsonWheels.setId(100L);

        OutsourcedPart hurleyWheels = new OutsourcedPart();
        hurleyWheels.setCompanyName("Hurley");
        hurleyWheels.setName("hurley wheels");
        hurleyWheels.setInv(3);
        hurleyWheels.setPrice(16.0);
        hurleyWheels.setId(101L);

        OutsourcedPart hurleyFrame = new OutsourcedPart();
        hurleyFrame.setCompanyName("Hurley");
        hurleyFrame.setName("hurley frame");
        hurleyFrame.setInv(2);
        hurleyFrame.setPrice(75.0);
        hurleyFrame.setId(102L);

        OutsourcedPart hudsonHandlebars = new OutsourcedPart();
        hudsonHandlebars.setCompanyName("Hudson");
        hudsonHandlebars.setName("hudson handlebars");
        hudsonHandlebars.setInv(1);
        hudsonHandlebars.setPrice(25.0);
        hudsonHandlebars.setId(103L);

        OutsourcedPart hudsonBrakes = new OutsourcedPart();
        hudsonBrakes.setCompanyName("Hudson");
        hudsonBrakes.setName("hudson brakes");
        hudsonBrakes.setInv(10);
        hudsonBrakes.setPrice(10.0);
        hudsonBrakes.setId(104L);

        outsourcedPartRepository.save(hudsonWheels);
        outsourcedPartRepository.save(hurleyWheels);
        outsourcedPartRepository.save(hurleyFrame);
        outsourcedPartRepository.save(hudsonHandlebars);
        outsourcedPartRepository.save(hudsonBrakes);
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */
        Product roadBike = new Product("road bike", 100,15);
        Product bmxBike = new Product("bmx bike", 150.0, 8);
        Product mountainBike = new Product("mountain bike", 125.0,5);
        Product hybridBike = new Product("hybrid bike", 175,3);
        Product electricBike = new Product("electric bike", 200.0, 2);
        productRepository.save(roadBike);
        productRepository.save(bmxBike);
        productRepository.save(mountainBike);
        productRepository.save(hybridBike);
        productRepository.save(electricBike);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
