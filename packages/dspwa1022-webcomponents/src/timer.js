class Timer extends HTMLElement {
  count = 0;
  interval;
  useShadowDom = true;
  shadow;

  connectedCallback() {
    this.setup();
    this.reset();
  }

  reset() {
    if (this.interval) {
      clearInterval(this.interval);
      this.count = 0;
      this.render();
    }
    this.interval = setInterval(() => {
      this.count++;
      this.render();
    }, 1000);
  }

  render() {
    const span = this.useShadowDom
      ? this.shadow.querySelector("[data-count]")
      : this.querySelector("[data-count]");
    span.textContent = this.count;
  }

  setup() {
    const span = document.createElement("span");
    span.setAttribute("data-count", "");
    span.textContent = this.count;

    const button = document.createElement("button");
    button.textContent = "reset";

    button.addEventListener("click", () => {
      this.reset();
    });

    if (this.useShadowDom) {
      this.shadow = this.attachShadow({ mode: "open" });
      this.shadow.appendChild(span);
      this.shadow.appendChild(button);
    } else {
      this.appendChild(span);
      this.appendChild(button);
    }
  }
}

window.customElements.define("dspwa1022-timer", Timer);
