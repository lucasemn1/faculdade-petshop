import axios from "axios";

export default class HttpClient {
  async get(url) {
    try {
      const response = await axios.get(url);
      return { status: response.status, data: response.data };
    } catch (error) {
      const { response } = error;
      throw response;
    }
  }

  async post(url, data) {
    try {
      const response = await axios.post(url, data);
      return { status: response.status, data: response.data };
    } catch (error) {
      const { response } = error;
      throw response;
    }
  }
}
