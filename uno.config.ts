import {
  defineConfig,
  presetAttributify,
  presetIcons,
  presetTypography,
  presetUno,
  presetWebFonts,
  transformerDirectives,
  transformerVariantGroup,
} from "unocss";

export default defineConfig({
  shortcuts: {
    footer: "text-base text-[#ababab]",
    left: "left-[var(--slidev-content-padding-left)]",
    right: "right-[var(--slidev-content-padding-right)]",
  },
  presets: [
    presetUno(),
    presetAttributify(),
    presetIcons(),
    presetTypography(),
    presetWebFonts(),
  ],
  transformers: [transformerDirectives(), transformerVariantGroup()],
});
