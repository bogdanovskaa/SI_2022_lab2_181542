# SI_2022_lab2_181542
Анастасија Богдановска 181542

# 2. Control Flow Graph
![CFG](https://user-images.githubusercontent.com/49886082/170848459-1ef85dec-d65c-40ac-a3fc-51479fad5761.jpg)


# 3. Цикломатска комплексност
   Графот има 23 темиња и 30 ребра па за да ја одредиме комплексноста пресметуваме V(G) = Edges - Nodes + 2 каде што Еdges = 30 е бројот на рабови и Nodes = 23 е бројот на јазли. V(G) 30 - 23 + 2 = 9. Цикломатската комплексност е 9


# 5. Test Cases
         

        @Test
        void everyStatementTestCriteria() {
        IllegalArgumentException exception = null;
        exception = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList()));
        assertTrue(exception.getMessage().contains("List length should be greater than 0"));
        exception = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList("0", "#", "#")));
       
        assertTrue(exception.getMessage().contains("List length should be a perfect square"));
        List<String> list = new ArrayList<>();
      
        list= createList("#", "#", "#", "#", "#", "#", "#", "#", "#");
        assertEquals(list, SILab2.function(list));
    }




        @Test
        public void everyBranchTestCriteria() {
        IllegalArgumentException exception = null;
        exception = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList()));
        assertTrue(exception.getMessage().contains("List length should be greater than 0"));
        
        exception = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList("0", "0")));
        assertTrue(exception.getMessage().contains("List length should be a perfect square"));
       
        List<String> list = new ArrayList<>();
        list= createList("#", "#", "0", "#", "0", "0", "0", "0", "#", "0", "0", "#", "0", "#", "#", "0");
        
        List<String> list2 = new ArrayList<>();
        list2= createList("#", "#", "2", "#", "2", "1", "0", "2", "#", "2", "2", "#", "2", "#", "#", "2");
        assertEquals(list2,  SILab2.function(list));
    }
