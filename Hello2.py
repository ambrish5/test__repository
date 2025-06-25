lass Person:
    ef __init__(self, name, age):
        self.name = name
        self.age = age

    def display_info(self):
        print(f"Name: {self.name}, Age: {self.age}")

if __name__ == "__main__":
    person = Person("Alice", 25)
    person.display_info()
