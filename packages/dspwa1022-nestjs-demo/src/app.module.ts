import { Module } from "@nestjs/common";
import { DictionaryModule } from "./modules/dictionary/dictionary.module";
import { CalculatorModule } from "./modules/calculator/calculator.module";

@Module({
  imports: [CalculatorModule, DictionaryModule],
})
export class AppModule {}
