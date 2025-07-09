
# 🧪 JQA_SeleniumSimple — UI автотестування на Java + Selenium + Gradle

Проект для запуску простих UI‑тестів за допомогою **Selenium WebDriver**, **Gradle** і **JUnit/TestNG**. Мінімум залежностей — максимум ефективності 🚀

---

## 📦 Що потрібно встановити

### 1. ☕ Java Development Kit (JDK)
- **Мінімальна версія**: JDK 8+ (рекомендовано JDK 11 або 17)
- **Завантажити:**
  - [Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
  - [OpenJDK (Adoptium)](https://adoptium.net/)
- **Перевірка встановлення:**
  ```bash
  java -version
  javac -version
  ```

---

### 2. 📐 Gradle (або Gradle Wrapper)
- Проєкт вже містить `gradlew`, тож **встановлювати Gradle необов’язково**.
- Якщо хочеш встановити глобально: [Gradle Official Site](https://gradle.org/install/)
- **Перевірка:**
  ```bash
  gradle -v
  ```

---

### 3. 🌐 Браузери та драйвери

#### 🔸 Chrome
- Встанови **Google Chrome**
- Завантаж **ChromeDriver**, що відповідає версії браузера: [ChromeDriver Downloads](https://sites.google.com/chromium.org/driver/)
- Додай драйвер до системного `PATH`, або прописуй явно:
  ```java
  System.setProperty("webdriver.chrome.driver", "шлях/до/chromedriver");
  ```

#### 🔸 Firefox
- Встанови **Mozilla Firefox**
- Завантаж [GeckoDriver](https://github.com/mozilla/geckodriver/releases)
- Аналогічно: додай до `PATH` або задай вручну у коді.

---

## 🛠 Рекомендовані інструменти

### 1. 💻 IDE для розробки
- **IntelliJ IDEA** (найкраща підтримка Java)
- **VS Code** + розширення:
  - [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
  - [Gradle for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-gradle)

---

### 2. 🔎 Перевірка збірки
```bash
./gradlew tasks        # Linux/macOS
gradlew.bat tasks      # Windows
```

---

### 3. 🧯 Вирішення проблем
- Якщо не завантажуються залежності:
  - Перевір proxy / антивірус
  - Спробуй оновити кеш:
    ```bash
    ./gradlew --refresh-dependencies
    ```

---

## 🚀 Як запустити тести

### 🔽 Клонування репозиторію
```bash
git clone https://github.com/DmtrjShevchenko/JQA_SeleniumSimple.git
cd JQA_SeleniumSimple
```

### ▶️ Запуск тестів
```bash
./gradlew test         # Linux/macOS
gradlew.bat test       # Windows
```

📁 Результати будуть у:  
```
build/reports/tests/
```

💡 Для дебагу додавай:
```bash
./gradlew test --info
./gradlew test --debug
```

---

## ✅ Готово!
Можеш розширювати проєкт, писати власні тести та інтегрувати з CI/CD (наприклад, GitHub Actions або Jenkins).

---

👨‍💻 Автор: [@DmtrjShevchenko](https://github.com/DmtrjShevchenko)
